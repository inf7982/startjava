-- �������� ��� �������
SELECT * FROM robots;

-- ���������� ������ �� ������������ �������
SELECT * FROM robots WHERE status != 'Destroyed';

-- ���������� ������� ���������� �����, �������� Mark-1 � Mark-6
SELECT * FROM robots WHERE mark = 'Mark-1' OR mark = 'Mark-6';

-- ������������ ������� �� �������� �� ������� mark
SELECT * FROM robots ORDER BY mark DESC;

-- ���������� ������ ������� ������
SELECT * FROM robots WHERE launch = (SELECT MIN(launch) FROM robots);

-- ���������� �������, ������� ���������� ������/������ ���� kaiju
SELECT * FROM robots WHERE kaijukill = (SELECT MAX(kaijukill) FROM robots);
SELECT * FROM robots WHERE kaijukill = (SELECT MIN(kaijukill) FROM robots);

-- ���������� ������� ��� �������
SELECT AVG(weight) FROM robots;

-- ��������� �� ������� ���������� ������������ kaiju � �������, ������� �� ��� ��� �� ���������
UPDATE robots SET kaijukill = kaijukill + 1 WHERE status != 'Destroyed';

-- ������� ������������ �������
DELETE FROM robots WHERE status = 'Destroyed';