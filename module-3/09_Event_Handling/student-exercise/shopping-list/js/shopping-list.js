let allItemsIncomplete = true;
const pageTitle = 'My Shopping List';
const groceries = [
  { id: 1, name: 'Oatmeal', completed: false },
  { id: 2, name: 'Milk', completed: false },
  { id: 3, name: 'Banana', completed: false },
  { id: 4, name: 'Strawberries', completed: false },
  { id: 5, name: 'Lunch Meat', completed: false },
  { id: 6, name: 'Bread', completed: false },
  { id: 7, name: 'Grapes', completed: false },
  { id: 8, name: 'Steak', completed: false },
  { id: 9, name: 'Salad', completed: false },
  { id: 10, name: 'Tea', completed: false }
];

/**
 * This function will get a reference to the title and set its text to the value
 * of the pageTitle variable that was set above.
 */
function setPageTitle() {
  const title = document.getElementById('title');
  title.innerText = pageTitle;
}


function markCompleted(item) {
  let icon = item.querySelector('i');
  if (!item.classList.contains('completed')) {
    item.classList.add('completed');
    icon.classList.add('completed');
  }

}
function markIncomplete(item) {
  let icon = item.querySelector('i');
  icon.classList.remove('completed');
  item.classList.remove('completed');
}

function toggleAll() {
  const items = document.querySelectorAll('li');
  if (allItemsIncomplete) {
    items.forEach((item) => {
      const icon = item.querySelector('i');
      icon.classList.add('completed');
      item.classList.add('completed');

    });
    const button = document.querySelector('.btn');
    button.innerText = 'Mark All Incomplete'
    allItemsIncomplete = false;
  } else {
    items.forEach((item) => {
      const icon = item.querySelector('i');
      icon.classList.remove('completed');
      item.classList.remove('completed');

    });
    const button = document.querySelector('.btn');
    button.innerText = 'Mark All Complete'
    allItemsIncomplete = true;


  }
}

/**
 * This function will loop over the array of groceries that was set above and add them to the DOM.
 */
function displayGroceries() {
  const ul = document.querySelector('ul');
  groceries.forEach((item) => {
    const li = document.createElement('li');
    li.innerText = item.name;
    const checkCircle = document.createElement('i');
    checkCircle.setAttribute('class', 'far fa-check-circle');
    li.appendChild(checkCircle);
    ul.appendChild(li);
  });
}

document.addEventListener("DOMContentLoaded", () => {
  setPageTitle();
  displayGroceries();

  const ul = document.querySelector('ul');
  ul.addEventListener('click', (event) => {
    event.preventDefault();
    markCompleted(event.target);

  });

  ul.addEventListener('dblclick', (event) => {
    event.preventDefault();
    markIncomplete(event.target);
  });


  const button = document.querySelector('.btn');
  button.addEventListener('click', (event) => {
    event.preventDefault();
    toggleAll();


  });

});