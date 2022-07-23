import { createRouter, createWebHashHistory } from "vue-router";
import NotFoundView from "@/views/NotFoundView.vue";

const stage = import.meta.env.VITE_STAGE;

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: "/404",
      component: NotFoundView
    },
    {
      path: "/:catchAll(.*)",
      redirect: "/404"
    },
    {
      name: "home",
      path: "/",
      component: () => import("@/views/HomeView.vue"),
      alias: "/home",
      meta: {
        requiresAuth: false
      }
    },
    {
      name: "session",
      path: "/session",
      component: () => import("@/views/SessionView.vue"),
      children: [
        {
          path: '',
          components: {
            default: () => import("@/views/LoginView.vue"),
            register: () => import("@/views/RegisterView.vue"),
          },

        }
      ]
    },
    {
      name: "about",
      path: "/about",
      component: () => import("@/views/AboutView.vue"),
    },
    {
      name: "chats",
      path: "/chats",
      component: () => import("@/views/ChatsView.vue"),
      meta: {
        requiresAuth: true,
        roles: ['admin']
      },
      children: [
        {
          path: ":chatId(\\d+)",
          component: () => import("@/views/ChatView.vue"),
          props: (route) => {
            return {
              chatId: route.params.chatId,
            };
          }
        }
      ]
    },
  ]
});

if (stage === "test") {
  router.addRoute({
      path: "/profile",
      name: "profile",
      component: () => import("@/views/ProfileView.vue"),
    },
  );
}

router.beforeEach((to, from) => {
  console.log(stage);
  // if ( to.meta?.requiresAuth && to.meta?.roles.includes('admin') ) {
  //   console.log(to.path, "requiresAuth");
  //   return '/session';
  // }

  return true;
});

export default router;