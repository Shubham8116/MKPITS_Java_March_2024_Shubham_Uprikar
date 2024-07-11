//Here different javascript functions are created and used in html document

 function getSquare(num)
 {
var sqr=num*num;
document.write(sqr);
alert("The square of the number " +num+" is : "+sqr);
 }

 function demoobject()
 {
    student={
        name:'Shubham',
        marks:100,
        city:'Nagpur'

    }
      document.write("The object details are : "+student.name+ " "+student.marks+" "+student.city);
 }
function demoobject1()
{
    var a=new Object();
    a.name='Shubham';
    a.marks=90;
    a.city='Nagpur';
    document.write("The object details are : "+a.name+ " "+a.marks+" "+a.city);
}

function checkObject()
{
    object1 = {
        a: 'shubham',
        b: 42,
       
      }
      var a=new Object();
      a.name='Shubham';
      a.marks=90;
      a.city='Nagpur';
      
      document.write(Object.values(object1));
      document.write("<br>")
      document.write(Object.values(a));
    }



