//'use strict';



function useOfStrict()
{
	x=100; // throws error if strict mode is enabled (x is not defined) 
	console.log(x);
}
useOfStrict();

function del()
{
	let x=12;
	console.log(delete x); // unqualified identifier in stict mode
	console.log(x);
}

del();
