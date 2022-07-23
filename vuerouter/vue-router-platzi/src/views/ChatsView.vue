<template>
  <div>
    <aside>
        <div v-for="chat in chats" :key="chat.id">
            <router-link :to="`/chats/${ chat.id }`">{{chat.name}}</router-link>
        </div>
    </aside>
    <article>
        <RouterView />
    </article>
  </div>
</template>

<script setup>
import { ref } from '@vue/reactivity';
import { watch } from '@vue/runtime-core';
import { useRoute } from 'vue-router';

const chats = ref();
const route = useRoute();

watch(
    () => route.params,
    (value) => {
    console.log('cambio', value);
    chats.value = [
        {
        id: 1,
        name: 'Xime'
        },
        {
            id: 2,
            name: 'Juan'
        },
        {
            id: 3,
            name: 'Pedro'
        }
    ];
}, {
    immediate: true
});

</script>
