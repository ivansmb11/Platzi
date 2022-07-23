<script setup>
const isTest = import.meta.env.VITE_STAGE === 'test';
</script>

<template>
<router-link :to="{ name: 'home' }">Home</router-link>
<router-link :to="{ name: 'session' }">Session</router-link>
<router-link :to="{ name: 'about' }">About</router-link>
<router-link v-if="isTest" :to="{ name: 'profile' }">Profile</router-link>
<router-link :to="{ name: 'chats' }">Chats</router-link>
<router-view/>
</template>
