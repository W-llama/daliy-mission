-- 코드를 입력하세요
SELECT  AI.ANIMAL_ID,AI.ANIMAL_TYPE,AI.NAME
FROM  ANIMAL_INS AS AI
JOIN  ANIMAL_OUTS AS AO ON  AI.ANIMAL_ID = AO.ANIMAL_ID
WHERE  AI.SEX_UPON_INTAKE LIKE 'INTACT%' AND AO.SEX_UPON_OUTCOME NOT LIKE 'INTACT%'
ORDER BY  ANIMAL_ID;