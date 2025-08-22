'use strict';

let obj1=new Object();

obj1.name="LH";
obj1.car="Ferrari";
obj1.champs=7;
obj1.display=function(){
	console.log("Method");
};
obj1.display();

let obj2 = { name:"MV",
             "car":"RedBull",
              champs:4,
	      description:function()
	      {
                 console.log("This:")
                 console.log(this);
	      	 return `Arguably the GOAT`;
              },
	      years:function()
	      {
		 return `2021,2022,2023,2024`;
              }
            };
console.log("object-2:");
console.log(obj2);

console.log(obj2.description());
console.log(obj2.years());
