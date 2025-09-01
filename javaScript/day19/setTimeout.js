'use strict';

const student={
    name:"Adam",
    greetings:function()
    {
        console.log(`Welcome Mr ${this.name}`);
    },
    goodbye:function()
	{
		console.log("Exit!");
	}
};
 
 
 
//setTimeout(student.greetings,1000); // gives undefined because here the function reference is passed but not the object
 
setTimeout(function(){
 student.greetings();  
},2000);

setTimeout( ()=>student.goodbye(),3000 );

// bind() has its this keyword permanently set to the value you provide
setTimeout(student.greetings.bind(student),3000);

setTimeout(()=>console.log(student.name),1000);
