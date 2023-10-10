//My variables for the 3 buttons 
let favoriteTeam = "Boston Celtics";
let favoriteCelebrity = "John Cena";
let favoritePlayer = "Jayson Tatum";

const displayFavoriteTeam = () => { //Arrow Function
    console.log (`My favorite team is the: ${favoriteTeam}`); //String Template Literal
    //This function is called in the index page which prints to the console my favorite NBA team, which would be the Boston Celtics
}

const displayFavoriteCelebrity = () => { //Arrow Function
    console.log (`My favorite celebrity is: ${favoriteCelebrity}`); //String Template Literal
    //This function is called in the guests page which prints to the console my favorite Celebrity, which would be the John Cena
}

const displayFavoritePlayer = () => { //Arrow Function
    console.log (`My favorite NBA Player is : ${favoritePlayer}`); //String Template Literal
    //This function is called in the events page which prints to the console my favorite NBA team, which would be the Boston Celtics
}

function toggleGuests(sectionId) {
    let section = document.getElementById(sectionId); //Finds the div with the id that matches the sectionId, this is used so I can call the same function on both the primary guests or secondary guests.
    section.style.display = (section.style.display === 'none') ? 'flex' : 'none'; //Ternary Operator which will change the display of the div based on whether or not the display is set to none. If it is the display will be flex and if it isn't it will be set to none
    //This works as a toggle feature essentially
}
