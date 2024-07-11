//1. **Array Manipulation:**
//- **Problem Statement:** Write a function `rotateArray(arr, k)` that takes an array `arr` and a number `k`, and returns the array 
//rotated to the right by `k` steps. For example, `rotateArray([1, 2, 3, 4, 5], 2)` should return `[4, 5, 1, 2, 3]`.


function rotateArray(arr,rotation)
        {

         var temp=new Array();
        for(var i=0;i<rotation;i++)
        {
        var element = arr.pop();
        temp.push(element);
        }

         var result= (temp.reverse()).concat(arr);
          return result;
         }