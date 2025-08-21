'use strict';

console.log(new Date().getTime()); //returns the number of milliseconds for this date since the epoch, which is defined as //the midnight at the beginning of January 1, 1970, UTC.
//console.log(Date.now());
//console.log(Date.UTC(2025,10));

let start = new Date();
for(let i=1;i<=100000;i++)
{
	Math.sqrt(i);
}
let end=new Date();

console.log(`Time for loop:${end.getTime()-start.getTime()} millisecond`);

console.log(Date.now());

let brd= new Date(2002,10,18);
console.log(brd.getDay());

console.log(Date.now());

console.log(new Date(null));

console.log(Date.parse("2025-08-21")); // A number representing the timestamp of the given date.

console.log(Date.UTC(1979,0,1)); //returns the number of milliseconds since January 1, 1970, 00:00:00 UTC
console.log(new Date(Date.UTC(1979,0,9,9,30,60)).toUTCString());

let yk = new Date("1979-01-09T09:30:00+05:30");
console.log(yk.getDate());
console.log(yk.getFullYear());
console.log(yk.getHours());

console.log(yk.getTime()); // returns the number of milliseconds for this date since the epoch,

console.log(yk.getTimezoneOffset());

console.log(yk.getUTCFullYear());

const present = new Date("2001-12-22");
present.setDate(14);
console.log(present);
present.setFullYear(1979);
console.log(present);
present.setHours(14,14,14);
console.log(present);

present.setUTCDate(17);
console.log(present.getUTCDate());

console.log(present.toString());
console.log(present.toISOString());

const newdate= new Date("2008-06-23T21:32:55");
console.log(newdate.toJSON());

console.log(newdate.toLocaleDateString());
console.log(newdate.toLocaleString());
console.log(newdate.toLocaleTimeString());

console.log(newdate.toDateString());
console.log(newdate.toUTCString());
console.log(newdate.toTimeString());




