<script setup>
import { ref } from '@vue/reactivity';
import { useRouter } from 'vue-router';

const username = ref();
const router = useRouter();

const iniciar = () => {
  router.push( { name: 'about' } );
}
</script>

<template>
  <main>
    <h3>Introduce tu nombre de usuario</h3>
    <input placeholder="username" v-model="username" />
    <button @click="iniciar">Iniciar sesión</button>
  </main>
</template>
