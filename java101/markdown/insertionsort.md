# Insertion Sort
[Problem Link] (https://app.patika.dev/courses/veri-yapilari-ve-algoritmalar/insertion-sort-proje)
## Proje 1
    [22,27,16,2,18,6] -> Insertion Sort

   
    
##  Yukarı verilen dizinin sort türüne göre aşamalarını yazınız.
  - [22,27,16,2,18,6] -> baslangic
  - [2,27,16,22,18,6] n
  - [2,6,16,22,18,27] n-1
  - [2,6,16,22,18,27] n-2
  - [2,6,16,18,22,27] n-3
  - [2,6,16,18,22,27] ...
  - [2,6,16,18,22,27] 1
## Big-O gösterimini yazınız.
n(n-1)(n-2)...1 -> O(n^2)
## Time Complexity: Average case: Aradığımız sayının ortada olması,Worst case: Aradığımız sayının sonda olması, Best case: Aradığımız sayının dizinin en başında olması.
    * Worst Case: O(n²) = n+(n-1)+(n-2)....+1
    * Average Case: O(n²)
    * Best Case: O(n)
##    Dizi sıralandıktan sonra 18 sayısı hangi case kapsamına girer? Yazınız.
  ???

## Proje 2
[7,3,5,8,2,9,4,15,6] dizisinin Insertion Sort'a göre ilk 4 adımını yazınız.
 - [7,3,5,8,2,9,4,15,6]
 - [2,3,5,8,7,9,4,15,6]
 - [2,3,5,8,7,9,4,15,6]
 - [2,3,4,8,7,9,5,15,6]
 - [2,3,4,5,7,9,8,15,6]
