## MY_BOARD JPA STUDY PROJECT
 1. Spring boot로 만들어진 JPA 프로젝트 입니다.
 2. Front Client는 React 프로젝트 입니다.
 3. 사용자 로그인(암호화 , 복호화, SSL 적용) 구축 목표
 4. Blob 파일의 저장 및 전송
 5. 코드미러를 통한 쿼리 빌더 예정
	
### 각 Collaborator는 각자 DB를 구축하여 진행합니다.
 1. 여유가 있을때 Aws S3 또는 firebase를 적용해볼까 합니다.
 2. DB는 MySQL을 사용합니다.

#### MY SQL 접속 정보
 - database Name : board
 - Port : 3306
 - host : http://localhost

#### 접속 정보는 ENV 파일에서 설정
 1. env 파일은 src/main/resource 의 properties 폴더에 생성하면된다.
 2. file 명은 env.properties 라고 명명한다.
	
 설정 내용은 아래와 같다.
	
```
properties.db.database=board
properties.db.userId={USR_ID}
properties.db.password={USER_PASSWORD}
properties.db.port=3306
properties.db.host=localhost
front.host=http://localhost
front.post=3000
```
	
 - 원하는 방향으로 DB를 만들어서 파일에 넣어 두면 WebMvcConfig에서 파일을 읽어 환경변수로 입력된다.
 - 그외 front client 관련 정보를 비롯한 것은 그대로 복붙하면 된다.
	
	