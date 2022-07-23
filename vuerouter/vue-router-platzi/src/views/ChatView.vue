<template>
  <div v-for="msg in filteredMessages" :key="msg.id">
    {{ msg.text }}
  </div>
</template>

<script>
export default {
    props: {
        chatId: {
            type: String,
            default: ''
        }
    },
    data() {
        return {
            messages: [
                {
                    id: 1,
                    text: 'Hola Xime',
                    author: 1
                },
                {
                    id: 2,
                    text: 'Hola Juan',
                    author: 2
                },
                {
                    id: 3,
                    text: 'Hola Pedro',
                    author: 3
                }
            ]
        }
    },
    computed: {
        filteredMessages() {
            return this.messages.filter((msg) => {
                return `${msg.author}` === this.chatId;
            });
        }
    }
}
</script>

<style>

</style>