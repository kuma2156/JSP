# 📘 JSP 학습 기록 

JSP와 서블릿, 웹 프로그래밍 전반에 대해 배운 내용을 정리한 학습 로그입니다.  
매 수업마다 어떤 내용을 배웠고, 어떻게 실습했는지 기록했습니다.

<div align="left">
    <h1>💻 학습자</h1>
    <table>
        <tr>
            <td align="center"><img src="https://github.com/user-attachments/assets/61049fd5-5e06-4b17-bb51-d925ea3e68dc" width="250"></td>
        </tr>
        <tr>
            <td align="center"><b>김명규</b></td>
        </tr>
        <tr>
            <td align="center"><b>https://github.com/kuma2156</b></td>
        </tr>
    </table>
</div>


## 🗓️ 학습 일지 요약

| 날짜         | 챕터/패키지                      | 주요 학습 내용                                                                 |
|--------------|----------------------------------|--------------------------------------------------------------------------------|
| 3월 9일      | Servlet 매핑                     | 기본 서버 연결 / 포트 충돌 문제 해결                                           |
| 3월 14일   | 챕터 6                           | 로그인 시스템 구현 / 체크박스 사용 / 매핑 이해                                 |
| 3월 16일     | 챕터 6                           | doGet, doPost, doHandle 방식 로그인 구현 / 서블릿 통신                        |
| 3월 21일     | 챕터 7                           | 웹과 DB(Oracle) 연동 / 코드 작성 및 오타 디버깅                               |
| 3월 23일     | 챕터 7                           | DAO, VO, Servlet 구조 / PreparedStatement / context.xml 리소스 설정           |
| 3월 28일     | sec02.ex02 ~ sec03.ex01         | 신규회원 등록 / 로그인 / 회원 삭제 기능 추가                                  |
| 3월 30일     | sec03.ex01 ~ sec04.ex01 (챕터 8)| Redirect, Refresh, Dispatch 포워딩 방식 / 테이블 연동                          |
| 4월 4일      | ServletContext, Config           | 자원 공유 및 param 불러오기 / 파일 입출력 실습                                 |
| 4월 6일      | sec04.ex02 ~ sec01.ex02 (챕터 9)| load-on-startup / 쿠키 & 세션 / hidden tag / URL rewriting 실습               |
| 4월 11일     | sec02.ex01 ~ ex02               | 서블릿에서 쿠키 가져오기                                                      |
| 4월 13일     | sec03.ex01 ~ sec04.ex01         | 세션 저장 / DB 연동 로그인 구현                                               |
| 4월 18일     | 챕터 10 sec01.01 ~ sec03.01     | URL 패턴과 필터 학습                                                          |
| 4월 20일     |                                  | Listener API 실습                                                             |
| 5월 4일      | 챕터 11 ~ 12                    | JSP 기본 구조 / 디렉티브 / 이미지 삽입 / 스크립트 요소와 주석 사용            |
| 5월 9일      |                                  | JSP 로그인 화면 / 이미지 리스트 출력                                          |
| 5월 11일     |                                  | session vs application 객체 비교 / request, out 예외 처리                     |
| 5월 16일     |                                  | JSP에서 스크립트릿 제거 후 태그 기반 구현 학습                                |
| 5월 18일     |                                  | 표현언어(EL) / 연산자 / 내장 객체(param, requestScope 등) / 빈 사용           |
| 5월 23일     |                                  | Collection, HashMap 실습 / Core 태그 사용 / 스코프 우선순위                   |
| 5월 25일     | 챕터 15                         | Core 태그 심화 / 파일 업로드 및 다운로드 실습                                 |
| 5월 29일     | 챕터 14 EXAM                    | JSTL 포매팅 태그 실습 / 회원 관리 예제 구현                                   |
| 5월 30일     |                                  | HTML5 개념 / jQuery 활용 홈페이지 실습                                        |

---

## 🧠 기억할 개념들 요약

### ✅ Servlet & JSP 핵심 요소

- `@WebServlet` 애너테이션 사용
- `ServletContext`, `ServletConfig`로 자원 공유
- doGet / doPost / doHandle 패턴
- session vs application 객체
- 쿠키 / 세션 / URL rewriting

### ✅ JSP 표현 언어 (EL)

- 연산자: `==`, `!=`, `>`, `<`, `empty`, `&&`, `||` 등
- 내장 객체: `param`, `paramValues`, `header`, `cookie`, `sessionScope`, `applicationScope`, `requestScope`, `pageContext`

### ✅ JSTL(Core 태그)

- `c:if`, `c:forEach`, `c:choose` 등 조건, 반복 처리
- EL 바인딩을 통한 데이터 출력

### ✅ 파일 입출력

- 파일 업로드 API 활용
- 다운로드 구현 (`file_updn` 디렉토리 지정)

---

## 🗂️ 프로젝트 디렉토리 구조

```
📦JSP_Study/
├── 📁assign1/                - 과제 1 관련 파일
├── 📁chapter05/              - 챕터 5 실습 (3월 9일)
├── 📁chapter06/              - 챕터 6 실습
├── 📁chapter07/              - 챕터 7 실습
├── 📁chapter08/              - 챕터 8 실습
├── 📁chapter09/              - 챕터 9 실습
├── 📁chapter10/              - 챕터 10 실습
├── 📁chapter11/webContent/   - 챕터 11 실습 (웹 리소스 포함)
├── 📁chapter12/              - 챕터 12 실습
├── 📁chapter13/              - 챕터 13 실습
├── 📁chapter14/              - 챕터 14 실습
├── 📁chapter15/              - 챕터 15 실습
├── 📁chapter16/webContent/   - 챕터 16 실습 (웹 리소스 포함)
├── 📁file_updn/              - 파일 업로드/다운로드 관련 예제
├── 📄README.md               - 학습 기록 및 요약 정리 문서
├── 📄context.xml             - DB 연결 리소스 설정 파일
├── 📄memberDAO.java          - DAO 클래스 (DB 처리 로직)
├── 📄memberServlet.java      - 회원 처리용 서블릿
├── 📄memberVO.java           - VO 클래스 (회원 데이터 모델)
├── 📄JSP 실습 계정 비번 tiger.sql - Oracle SQL 계정 정보 및 테이블 스크립트
```

> 📌 각 챕터는 JSP 학습 주제별로 나눠져 있으며, 실습 및 예제 코드를 포함하고 있습니다.  
> 📌 Servlet/DAO/VO 구조를 활용한 MVC 패턴 예제도 포함되어 있습니다.
