CREATE INDEX professor_index
ON professor (professor_id, first_name, second_name);

CREATE TABLE student
(
    student_id INT NOT NULL,
    first_name NVARCHAR(20),
    second_name NVARCHAR(20),
    group_number VARCHAR(10),
    PRIMARY KEY(student_id)
)

CREATE TABLE subject
(
    subject_id INT NOT NULL,
    subject_name NVARCHAR(50),
    CONSTRAINT  professor_id  FOREIGN KEY ( professor_id)
    REFERENCES  professor ( professor_id),
    PRIMARY KEY(subject_id)
)

CREATE TABLE graduate
(
    CONSTRAINT subject_id  FOREIGN KEY (subject_id)
    REFERENCES subject (subject_id)
    CONSTRAINT student_id  FOREIGN KEY (student_id)
    REFERENCES student (student_id)
    graduate_value INT,
    exam_date DATE,
    graduate_id INT NOT NULL
    PRIMARY KEY(graduate_id)
)

CREATE TABLE professor
(
    professor_id INT NOT NULL,
    first_name NVARCHAR(20),
    second_name NVARCHAR(20),
    CONSTRAINT power_id  FOREIGN KEY (power_id)
    REFERENCES professor_power_type (power_id)
    PRIMARY KEY(professor_id)
)

CREATE TABLE professor_power_type
(
    power_id INT NOT NULL,
    power_index INT,
    power_name TEXT
    PRIMARY KEY(power_id)
)
