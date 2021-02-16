# 2020-1학기-모바일 프로그래밍-나만의 어플 만들기
## 날씨 어플       
               
                        
                        
                        
              
### 개요
--- 
* **STEP 1** :모바일 프로그래밍 과제로 나만의 어플을 만들게 되었다.
우리가 한학기 동안 배웠던 내용을 이용하여 어플을 구현하려고 한다.
* **STEP 2** :내가 원하는 지역의 날씨를 검색하고 달력을 통하여 일정을 메모할 수 있는 다이어리 같은 어플을 만들기로 결정하고 우리가 배운 내용 중 
어떤 것들을 활용하면 좋을지 생각해 보았다.
URL, 인텐트, 데이트피커 

### 들어가며
*이번 과제를 통해 안드로이드 스튜디오를 활용하여 수많은 방법과 기술들로 어플을 개발할 수 있다는 사실을 깨닫게 되었다. 하지만 구글링이나 다른 오픈소스를 사용하지 않고 오로지 100% 이번학기에 우리가 배웠던 기술들만을 사용해 직접 스스로 어플을 구현했다는 사실을 밝힌다.*

---

## 1. 메인화면
![image](https://user-images.githubusercontent.com/60773356/108058028-c48e5680-7096-11eb-87fd-7678b9471749.png)
#### 날씨 검색 버튼
* 날씨 검색 액티비티인 WeatherActivity가 실행 되게 된다.
* 이때에 명시적 인텐트를 사용하였다.

#### 달력 보기 버튼
* 달력 보기 버튼을 클릭하면  데이트 피커와 일정을 메모할 수 있는 액티비티인 CalendarActivity가 실행된다.
* 일정을 메모한 뒤 메인화면으로 나와도 그 일정을 볼 수 있게 하기위해서 양방향 액티비티를 사용하였다.



## 2. 날씨 검색 화면
![image](https://user-images.githubusercontent.com/60773356/108058341-3ff00800-7097-11eb-8748-de01555c7106.png)
* 에디트 텍스트에 내가 사는 지역 (Ex: 창원, 신창면, 천안)을 입력하고 날씨 검색버튼을 누르면 암시적 인텐트를 통하여 URL이 오픈되며 내가 원하는 날씨를 볼수 있다.
* 돌아가기 버튼을 누르면 메인 액티비티로 돌아간다.

![image](https://user-images.githubusercontent.com/60773356/108058442-6615a800-7097-11eb-8fee-167689e542b6.png)
* 이 화면은 에디트 텍스트에 신창면을 입력하고 날씨 검색을 눌렀을 때의 화면이다.
* 화면과 같이 암시적 인텐트를 통해 url을 실행시켰다.



## 3. 달력 보기 화면
![image](https://user-images.githubusercontent.com/60773356/108058606-9b21fa80-7097-11eb-86dc-f67ce07f4c66.png)
* 달력 보기 화면에는 데이트피커와 아래의 에디트 텍스트 화면으로 구성된다.
* 데이트 피커에서 날짜를 클릭하면 새로운 액티비티인 일정을 추가하는 화면이 나온다.
* 이는 setOnDateChangeListener을 이용하여 날짜를 클릭시 새로운 액티비티가 뜨도록 구현시켰다.

![image](https://user-images.githubusercontent.com/60773356/108058689-b7be3280-7097-11eb-8da4-d84251612465.png)
* 이 화면은 데이트피커의 날짜를 클릭했을 시 화면이다. 
* 여기의 에디트 텍스트에 일정을 적은 후 저장하기 버튼을 누르면 양방향 액티비티를 통해 그 값이 앞선 달력보기 화면 아래의 노란색 에디트 텍스트 부분에 저장된다.

![image](https://user-images.githubusercontent.com/60773356/108058733-cad10280-7097-11eb-8eee-81794375b16e.png)
* 앞선 내용과 같이 나의 일정을 입력한 후 저장화면을 눌렀을 때 일정이 저장되어 나타나는 모습이다.
* 양방향 액티비티를 통해 값을 서로 주고받게 하여 입력한 값을 불러오게하여 구현하였다.
* 메인 액티비티와 달력 보기 액티비티를 양방향 액티비티로 구현해 놨기 떄문에 메인화면으로 돌아간 후에 다시 달력 보기 화면으로 돌아와도 앞서 저장했던 일정이 그대로 남아있는 것을 볼 수 있다.





### 개선점
* 처음 내가 만들기 위하여 구글링을 통해 많은 안드로이드 스튜디오의 기능을 찾아보았을 때, gps를 통해 나의 위치를 받아오는 기능이 있었다. 후에 조금더 그것에 대해 찾아보고 공부해본 후, 이번 프로젝트를 보완하여 더 좋은 방향으로 만들어 보고싶고 또 다른 많은 기능들을 추가하여 좀 더 완벽한 어플을 만들어 보고싶다.


### 향후 계획
* 멀게만 느껴졌던 모바일 어플 개발이라는 일이 이번학기 모바일 프로그래밍이라는 과목을 통해 나에게 매우 근접하게 다가왔다. 더 많은 것들을 배우지 못한 것이 아쉽지만 그래도 이번 학기를 통해 많은 것을 알고 배울 수 있었다. 더욱이 이미 배웠던 자바언어를 사용하여 개발을 할 수 있었기에 더욱 좋았다.
더 많은 것을 공부하여 좋은 어플들을 개발해보고 싶다.




