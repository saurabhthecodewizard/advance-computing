DROP PROCEDURE IF EXISTS rect;

DELIMITER $$

CREATE PROCEDURE rect(L INT, W INT)
BEGIN
	DECLARE area INT;
    DECLARE perimeter INT;
	SET area = L * W;
	SELECT 2*(L+W) INTO perimeter;
	SELECT area AS AREA, perimeter AS PERIMETER;
END;
$$

DELIMITER ;