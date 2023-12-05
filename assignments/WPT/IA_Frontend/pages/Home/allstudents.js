import { useEffect, useState } from "react"
import axios from 'axios'
import { toast } from "react-toastify"
import Boy from "../../components/student"
import { useNavigate } from "react-router"



const AllStudents = () => {

    const [students, setStudents] = useState([])

    const navigate = useNavigate()

    const getAll = () => {

        const url = `http://localhost:4000/student/getall`

        axios.get(url).then((response) => {
            const result = response.data
            console.log(result)
            toast.success('Welcome admin')
            setStudents(result)
            console.log(students)
            
        })
        
    }

    useEffect(() => {
        getAll()
        console.log('getting called')
    }, [])

    const logoutUser = () => {

        sessionStorage.removeItem('rollNo')
        sessionStorage.removeItem('name')
        sessionStorage.removeItem('division')
        sessionStorage.removeItem('dateofbirth')
        sessionStorage.removeItem('parent_mobile_no')

        toast.success('Logged out successfuly')

        navigate('/signin')
    }


    return (
        <div>
            <h1>All students</h1>
            <hr />
            <div className="row">
                <div className="col">
                        {students.map((student) => {
                            return <Boy student={student} />
                        })}
                </div>
                <br />
                <div className="mb-3" margin="10px">
                        <button onClick={logoutUser} className="btn btn-success">Logout</button>
                    </div>
            </div>
        </div>
    )

}

export default AllStudents