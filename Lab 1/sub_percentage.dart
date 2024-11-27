import 'dart:io';

void main(){

  double ans = 0;

  for(int i = 0 ; i < 5 ;i++ ){
     stdout.write('Enter Marks =');
     ans+=double.parse(stdin.readLineSync()!);
  }
  print('Ans:${ans/5}');
}