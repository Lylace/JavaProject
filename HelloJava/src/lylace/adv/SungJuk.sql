create table sungjuk (
	sjno	int	primary key,
	name	nvarchar2	not null,
	kor		number(3),
	eng		number(3),
	mat		number(3),
	tot		number(3),
	avrg	number(4,1),
	grd		nvarchar2(1),
	regdate	timestamp default sysdate
);			-- 성적 테이블 생성

create	sequence	sjno;	-- 시퀀스(일련번호) 생성

insert into sungjuk (sjno, name, kor, eng, mat, tot, avrg, grd)
values	(sjno.nextval, '혜교', 99,98,97,296,99.8,'가');
-- 성적 데이터 추가

select sjno,name,kor,eng,mat from sungjuk
order by sjno desc;
-- 성적 데이터 전체 조회 내림차순

select * from sungjuk
where sjno = 1;
-- 상세 성적 데이터 조회(개별)

select 우편번호, 시도, 시군구, 읍면, 도로명, 건물번호본번, 건물번호부번, 시군구용건물명, 법정동명, 리명, 지번본번  from code_seoul;

