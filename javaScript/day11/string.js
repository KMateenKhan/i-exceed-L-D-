'use strict';

const string1 = "A string primitive";
const string2 = 'Also a string primitive';
const string3 = `Yet another string primitive`;

const string4 = new String("A String object");

console.log(typeof string1);
console.log(typeof string2);
console.log(typeof string3);

console.log(typeof string4); // object

const s1 = "2 + 2"; // creates a string primitive
const s2 = new String("2 + 2"); // creates a String object

console.log(eval(s1)); // returns the number 4
console.log(eval(s2)); // returns the string "2 + 2"

// A String object can always be converted to its primitive counterpart with the valueOf() method.
console.log(eval(s2.valueOf()));

console.log(String.fromCharCode(65, 66, 67)); // returns "ABC"
console.log(String.fromCharCode(0x2014)); // returns "—"

console.log(String.fromCodePoint(300));

console.log("CharCode and CharPoint:");
console.log(String.fromCodePoint(0x1f303)); // or 127747 in decimal
//console.log(String.fromCharCode(0x1f303)); 

console.log("a>=ab");
console.log("a">="ab");

console.log(0 == String("0"));
console.log(0 === String("0"));

console.log(true >= "false");