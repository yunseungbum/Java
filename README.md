split() : 특정 문자를 자를때 사용할 수 있는 메서드
String rsp = {052};
ex) String[] arr = rsp.split("");
출력: 052

Arrays,sort(변수);  -> 배열오름차순정렬

향상된for문(for-each)
:배열을 사용할때 기존for문보다 편리하게 사용가능
ex) for(int i=0; i<numbers.length;i++){
int number = numbers[i];
}
-> for(int number: numbers{
}

 Integer.parseInt(); 괄호안에 있는 문자열를 숫자로 변환

Math.sqrt(변수) -> 변수의 제곱근을 구함
Math.pow(n,m) -> n의 m승 만큼 출력
ex) Math.pow(2,3) = 8

toCharArray() : String 문자열을 char형 배열로 바꿔서 반환해주는 메서드이다.

substring(x) : x의 값부터 그 뒤의 문자열 반환 
substring(x,y): x의 위치부터 y까지 문자열 반환

