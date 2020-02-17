var name = prompt("Input Name");
// strip first character
var firstChar = name.slice(0,1);
// convert first character to uppercase
var uppercasefirst = firstChar.toUpperCase();
// since we do not know the size of user input 
var remchar = name.slice(1,name.length); // name.length will give the length of string input from user
// convert remaining to lowercase
var smallerise = remchar.toLowerCase();
alert(uppercasefirst + smallerise);