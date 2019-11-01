<template>
  <KeyboardAvoidingView class="container" behavior="height" enabled>
    <text v-for="(message, index) in messages"
          :key="index"
          class="text"
          :class="'text--' + message.type">
          {{ message.text }}
    </text>
    <view class="input-container">
      <text-input class="answer-input" v-model="userInput"/>
      <button color="#0E494E" title="Senden" :on-press="send" />
    </view>
  </KeyboardAvoidingView>
</template>

<script>
    export default {
        data: function() {
            return {
                userInput: '',
                messages: [
                  {
                    type: 'god',
                    text: 'Wo bist du?'
                  }
                ]
            };
        },
        methods: {
          send: function() {
            this.messages.push({
              type: 'user',
              text: this.userInput
            });
            this.userInput = '';
          }
        }
    }
</script>

<style>
  .container {
    background-color: #74999C;
    align-items: flex-start;
    justify-content: flex-end;
    flex: 1;
    padding: 10;
  }

  .input-container {
    flex-direction: row;
  }

  .text {
    border-color: #013034;
    border-width: 1;
    border-radius: 5;
    margin-bottom: 10;
    padding: 10;
  }

  .text--god {
    background-color: #CFD6D7;
  }
  
  .text--user {
    background-color: white;
    align-self: flex-end;
  }

  .answer-input {
    flex-grow: 1;
    height: 40;
    width: 100;
    background-color: white;
    border-color: #013034;
    border-width: 1;
    padding: 10;
  }
</style>
