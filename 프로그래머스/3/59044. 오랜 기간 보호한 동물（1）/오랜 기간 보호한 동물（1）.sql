-- 코드를 입력하세요
SELECT A.NAME, A.DATETIME
FROM animal_ins AS A LEFT JOIN animal_outs AS B ON A.animal_id = B.animal_id
WHERE B.DATETIME IS NULL
ORDER BY A.DATETIME LIMIT 3