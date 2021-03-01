<template>
  <div class="book-container">
    
      <div v-for="book in books" v-bind:key="book.title"></div>
       

  </div>
</template>

<script>
import BookCard from './componeents/BookCard';

export default {
  

  

    name: 'reading-list',
    props:['books']
};
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>