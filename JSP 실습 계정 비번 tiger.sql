--ȸ�� ������ ���̺� ����
create table t_member(
    id varchar2(10) primary key,
    pwd varchar2(10),
    name varchar2(50),
    email varchar2(50),
    joinDate date default sysdate
);
    
--ȸ�� ���� �߰�
insert into t_member
values('hong','1212','ȫ�浿','hong@naver.com',sysdate);

insert into t_member
values('lee','1212','�̼���','king@naver.com',sysdate);

insert into t_member
values('kim','1212','����','kuma2156@naver.com',sysdate);

insert into t_member
values('dding','1212','���','dding@naver.com',sysdate);

insert into t_member
values('ss','1212','SS','dding@naver.com',sysdate);

commit;

select * from t_member;