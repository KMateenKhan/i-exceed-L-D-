'use strict';

let parent={
    name:"Adam",
    calculateAge:function(dob)
    {
        this.dob=dob;
        console.log(new Date().getFullYear()-this.dob);
    },
    qualification:"B.Tech",
};
 
let child={
    name:"Bilal",
    __proto__:parent,
    calculateAge:function(dob)
    {
        this.dob=dob;
        console.log(dob);
    },
   
 
};
 
let educ={
    __proto__:child,
    qualification:"ISE",
}

let puc={
	__proto__:parent, // if function is not present directly refers to the parent not child
}

 
child.calculateAge(2002); // if function is present then it executes else inherits it
console.log(educ.qualification);
puc.calculateAge(1979);
console.log(`Parent: ${puc.name}`)