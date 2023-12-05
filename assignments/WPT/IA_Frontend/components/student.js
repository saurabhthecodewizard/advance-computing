import axios from "axios"
import { useNavigate } from "react-router"
import { toast } from "react-toastify"

const Boy = (props) => {
    const {student} = props
    console.log(student)

    const navigate = useNavigate()

    const deleteStudent = (rollNo) => {
        console.log(rollNo)

        const url = `http://localhost:4000/student/delete/${rollNo}`

        axios.delete(url).then((response) => {
            const result = response.data
            if(result['status'] == 'success') {
                toast.success('Student deleted successfully')
            } else {
                toast.error(result['error'])
            }
        })

        navigate('/refresh')

    }

    return (
        <div>
            <div className="row">
                <div className="col">
                    <div>
                        Name : {student.name}
                    </div>
                    <div>
                        <button onClick={() => {
                            deleteStudent(student.roll_no)
                        }} className="btn btn-danger">Delete</button>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Boy