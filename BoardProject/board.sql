CREATE TABLE board(
   num NUMBER PRIMARY KEY, -- �� �Խñ��� �����ϴ� ��
   writer VARCHAR2(10) NOT NULL, -- �ۼ���
   email VARCHAR2(30),
   subject VARCHAR2(50) NOT NULL, -- �� ����
   passwd VARCHAR2(12) NOT NULL,
   reg_date TIMESTAMP(9) NOT NULL,
   readcount NUMBER DEFAULT 0,
   ref NUMBER NOT NULL, --�� �׷��ȣ (design column)
   re_step NUMBER NOT NULL, -- ���� �� �׷쿡�� �� ���� ��µǴ� ����
   re_level NUMBER NOT NULL, -- ��۷���(�鿩���� ����)
   content VARCHAR2(4000) NOT NULL -- �� ����
);

CREATE SEQUENCE board_seq;

SELECT * FROM board;
