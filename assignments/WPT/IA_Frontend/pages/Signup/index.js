import { useState } from "react"
import { useNavigate } from "react-router"
import { toast } from "react-toastify"
import axios from 'axios'
import { Link } from "react-router-dom"




const Signup = () => {
    const [ rollNo, setRollNo] = useState(0)
    const [ name, setName] = useState('')
    const [ classes, setClasses] = useState('')
    const [ division, setDivision] = useState('')
    const [ dob, setDob] = useState('')
    const [ parentMobileNo, setParentMobileNo] = useState('')

    const navigate = useNavigate()

    const addStudent = () => {
        if(rollNo == 0) {
            toast.warning('Enter valid roll number')
        } else if(name.length == 0) {
            toast.warning('Enter name')
        } else if(classes.length == 0) {
            toast.warning('Enter class')
        } else if(division.length == 0) {
            toast.warning('Enter division')
        } else if(dob.length == 0) {
            toast.warning('Enter dob')
        } else if(parentMobileNo.length == 0) {
            toast.warning('Enter parent number')
        } else {
            const body = {
                rollNo,
                name,
                classes,
                division,
                dob,
                parentMobileNo,
            }
        

        const url = `http://localhost:4000/student/add`

        axios.post(url, body).then((response) => {
            const result = response.data

            if(result['status'] == 'success') {
                toast.success('Successfully added student')

                navigate('/signin')
            } else {
                toast.error(result['error'])
            }
        })
    }
    }

    return (
        <div>
            <h1>Add new student</h1>

            <div className="row">
                <div className="col"></div>
                <div className="col">
                    <div className="form">
                        <div className="mb-3">
                            <label htmlFor="" className="label-control">Roll number</label>
                            <input onChange={(e) => {
                                setRollNo(e.target.value)
                            }} type="number" className="form-control" />
                        </div>

                        <div className="mb-3">
                            <label htmlFor="" className="label-control">Name</label>
                            <input onChange={(e) => {
                                setName(e.target.value)
                            }} type="text" className="form-control" />
                        </div>

                        <div className="mb-3">
                            <label htmlFor="" className="label-control">Class</label>
                            <input onChange={(e) => {
                                setClasses(e.target.value)
                            }} type="text" className="form-control" />
                        </div>

                        <div className="mb-3">
                            <label htmlFor="" className="label-control">Division</label>
                            <input onChange={(e) => {
                                setDivision(e.target.value)
                            }} type="text" className="form-control" />
                        </div>

                        <div className="mb-3">
                            <label htmlFor="" className="label-control">Date of birth</label>
                            <input onChange={(e) => {
                                setDob(e.target.value)
                            }} type="date" className="form-control" />
                        </div>

                        <div className="mb-3">
                            <label htmlFor="" className="label-control">Parents number</label>
                            <input onChange={(e) => {
                                setParentMobileNo(e.target.value)
                            }} type="text" className="form-control" />
                        </div>

                        <div className="mb-3">
                            <div>
                                Get specific student details <Link to="/signin">here</Link>
                            </div>
                            <button onClick={addStudent} className="btn btn-primary">Sign up</button>
                        </div>
                    </div>
                </div>
                <div className="col"></div>
            </div>
        </div>
    )

}

export default Signup