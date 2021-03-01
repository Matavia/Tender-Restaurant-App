 <button
              class="mark-unread"
              v-if="book.read === 'true'"
              v-on:click="flipStatus(user.id)"
            >
              Disable
            </button>
            <button
              class="btnEnableDisable"
              v-if="user.status === 'Disabled'"
              v-on:click="flipStatus(user.id)"
            >
              Enable
            </button>


flipStatus(isbn){
    if(this.book.read === true){
        this.book.read === false;
    }else{
        this.book.read === true;
    }
}