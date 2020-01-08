# 1st Week
- Android Studio 개발환경
- Android project - Manifest, java, res, gradle
- Git 기초 개념 - Android Studio, Sourcetree에서 사용
```
1. 각자 깃허브 계정으로 이 repository fork하기
2. fork한 내 repository를 clone하기 - Android Studio에서 'Checkout from Version Control'
    (Sourcetree에서 Add 누르고 로컬 프로젝트 폴더 경로 입력)
3. branch를 꼭 '내 이름'으로 checkout하고 과제 작업!
4. commit한 후 내 원격 repository에 push하기
5. 내 깃허브 계정으로 들어가서 Create pull request (내 이름의 branch로)

~~ 매주 3~5번을 반복합니다 ~~
```

# 2nd Week
- View의 개념과 기본 속성
- View - TextView, EditText, ImageView, Button, CheckBox, Switch
- Layout - LinearLayout, RelativeLayout, GridLayout, ConstraintLayout, FrameLayout, DrawerLayout
```
[Homework] 로그인 액티비티 만들어오기
1. TextView 1, EditText 2, ImageView 1, Button 1을 포함
2. ID, Password 값을 미리 String으로 지정해두고, 일치할 경우 로그인 성공, 아닐 경우 실패 토스트 띄우기
```

# 3rd Week
- Activity와 Fragment - LifeCycle, Context, Intent, Bundle
- Intent로 Activity 간 데이터 전달, onActivityResult 메서드
- Fragment와 TabLayout, ViewPager
```
[Homework] Intent로 데이터 전달, TabLayout, ViewPager 심화 예제
1. 한 Activity에 Button 하나씩 포함, Activity 2개 만들기
2. 데이터를 보내고 확인할 수 있는 View 자유롭게 구성
2. TabLayout과 ViewPager 연결하기!
    Hint: viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
```

# 4th Week
- JAVA 기본 개념 
    - 클래스(class), 생성자(constructor)
    - 상속(extend)
    - static, final
    - 인터페이스(interface), 리스너(listener)
    - 오버로딩(overloading)과 오버라이딩(overriding)