function display()
{
    var x=10;
    function display1()
        {
            var y=20; // only access within display1() block
            console.log(x);
            console.log(y);
        }
        //console.log(y);// gives error as y is been accessed outside the function
    display1();
}
display();