-- 코드를 입력하세요
SELECT  A.APNT_NO
        ,P.PT_NAME
        ,P.PT_NO
        ,A.MCDP_CD
        ,D.DR_NAME
        ,A.APNT_YMD
  FROM  APPOINTMENT AS A
  JOIN  PATIENT AS P
    ON  A.PT_NO = P.PT_NO
  JOIN  DOCTOR AS D
    ON  D.DR_ID = A.MDDR_ID
 WHERE  A.MCDP_CD = 'CS' 
        AND DATE_FORMAT(A.APNT_YMD, '%Y-%m-%d') = '2022-04-13'
        AND APNT_CNCL_YN = 'N'
 ORDER
    BY  APNT_YMD