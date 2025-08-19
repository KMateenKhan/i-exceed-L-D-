'use strict;'

let q=undefined;
let w=null;
let e=NaN;

//Number conversion
console.log(Number(q));

console.log(Number(w)); // is zero

console.log(Number(e));

//Boolean conversion
console.log(Boolean(q));

console.log(Boolean(w));

console.log(Boolean(e));

console.log(Boolean(""));
console.log(Boolean("0"));

console.log("Undefined : ",typeof q);
console.log("Null : ",typeof w); // object
console.log("NaN : ",typeof e);

console.log("Falsely values");
console.log(undefined && true);
console.log(NaN && true);
console.log(null && true);