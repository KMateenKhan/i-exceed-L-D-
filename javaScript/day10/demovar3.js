function iter()
{
	for(var i=1;i<=4;i++)
	{
		
	}
	console.log(i); // variable leak gives '5' as output

	for(let j=1;j<3;j++)
	{
	}
	console.log(j); // let has block scope gives error
}
iter();