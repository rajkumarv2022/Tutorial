#include <bits/stdc++.h>
using namespace std;

// Function to find golomb number
int golomb(int n){

   // First element is 1
   if (n == 1) {
      return 1;
   }
   
   // Satisfying property of golomb sequence for the nth number
   return 1 + golomb(n - golomb(golomb(n - 1)));
}

// Function to generate golomb sequence
vector<int> golombSeq(int n){
   vector<int> seq(n, 0);
   for (int i = 1; i <= n; i++){
      seq[i - 1] = golomb(i);    
      }
   return seq;
}
int main(){
   int n = 15;
   vector<int> seq = golombSeq(n);
   cout << "Golomb sequence up to " <<n << " terms: ";
   for (int i = 0; i < n; i++)    {
      cout << seq[i] << " ";
   }
   return 0;
} 


