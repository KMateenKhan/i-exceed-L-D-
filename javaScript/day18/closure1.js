function outer()
 {
    let count=0;
 
    return function()
    {
        count++;
        return count;
    }
 
 }
 outer();

 //const counter1=outer();
 
 //console.log(counter1());
 //console.log(counter1());