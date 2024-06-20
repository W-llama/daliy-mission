-- 코드를 입력하세요
SELECT YEAR(B.SALES_DATE) YEAR, MONTH(B.SALES_DATE) MONTH, 
       A.GENDER, COUNT(DISTINCT A.USER_ID) USERS
  FROM USER_INFO A INNER JOIN ONLINE_SALE B 
    ON A.USER_ID = B.USER_ID
 WHERE GENDER IS NOT NULL
 GROUP BY YEAR(SALES_DATE), MONTH(SALES_DATE), GENDER
 ORDER BY 1,2,3;