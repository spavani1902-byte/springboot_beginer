// JSON
// Object
// var user={"name":"John","gender":"Male"}
// console.log(user.name); // Output: John
// console.log(user.gender); // Output:
// Array
// var userArray=[{"name":"John","gender":"Male"},{"name":"Jane","gender":"Female"}];
// var janeUser=userArray[1];
// console.log(userArray.length); // Output: 2
// console.log(janeUser.name); // Output: Jane
var currentUserIndex=1;
var userArray=[
    {"name":"John","gender":"Male","img":"/img/john.png"},
    {"name":"Jane","gender":"Female","img":"/img/jane.png"}];
function toggleCard(){
    currentUserIndex=1-currentUserIndex;
    var nextUser=userArray[currentUserIndex];
    console.log(nextUser);
    displayUser(nextUser);
}
function displayUser(user){
    document.getElementById("userImage").src=user.img;
    document.getElementById("userName").textContent=user.name;
    document.getElementById("userGender").textContent=user.gender;
}