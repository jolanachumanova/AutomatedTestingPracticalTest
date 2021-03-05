select school.school_name, school.city as "school_city", student.student_name, student.city as "student_city"
from student
    join school on school.school_id = student.school_id
where student.city not in ('New York')
and student.city = school.city
;