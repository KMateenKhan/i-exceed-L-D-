'use strict';

//BigInt 8 bytes range
//int for speed and BigInt for range

console.log(Number.MAX_SAFE_INTEGER);
console.log(Number.MIN_SAFE_INTEGER)

// BigInt is larger than MAX_SAFE_INTEGER

let bigInt = BigInt(1234567890123456789012n);
console.log(bigInt);

let x = BigInt(123456789987654321n);
let y = BigInt(123456789987654321n);

console.log("Operations:");
console.log(x+y);
console.log(x*y);
console.log(x/y);
console.log(x%y);
console.log(2n ** 200n);
console.log(x ** 2n);

console.log(typeof 1n === 'bigint');
console.log(typeof Object(1n) === "object" );

let arr=[0,1,-5n,2,3n,12n,15,11n];
//arr.sort();
//console.log(arr);
arr.sort((a, b) => {
  return (typeof a === 'bigint' ? Number(a) : a) - (typeof b === 'bigint' ? Number(b) : b);
});
console.log(arr);
