<template>
  <view class="container">
    <text class="text">Wo bist du?</text>
    <text v-if="displayedAnswer" class="text text--answer">{{ displayedAnswer }}</text>
    <view class="input-container">
      <text-input class="answer-input" v-model="answer"/>
      <button color="#0E494E" title="Senden" :on-press="send" />
    </view>
  </view>
</template>

<script>
    export default {
        data: function() {
            return {
                answer: '',
                displayedAnswer: ''
            };
        },
        methods: {
          send: function() {
            this.displayedAnswer = this.answer;
            this.answer = '';
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
  background-color: #CFD6D7;
  border-color: #013034;
  border-width: 1;
  border-radius: 5;
  margin-bottom: 10;
  padding: 10;
}

.text--answer {
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
