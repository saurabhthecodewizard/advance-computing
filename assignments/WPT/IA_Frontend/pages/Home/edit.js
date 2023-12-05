import { useState } from "react"
import { toast } from "react-toastify"
import axios from 'axios'
import { useNavigate } from "react-router"



const EditStudent = () => {

    const [ parentMobileNo, setParentMobileNo] = useState('')
    const [ division, setDivision] = useState('')
    const currentParentMobleNo = sessionStorage['parent_mobile_no']
    const currentDivision = sessionStorage['division']
    const currentRollNumber = sessionStorage['rollNo']

    const navigate = useNavigate()

    const goBack = () => {
        navigate('/home')
    }

    const edit = () => {
        if(parentMobileNo.length == 0) {
            toast.warning('Enter parent number')
        } else if(division.length == 0) {
            toast.warning('Enter division')
        } else {
            const body = {
                parentMobileNo,
                division,
            }

            const url = `http://localhost:4000/student/edit/${currentRollNumber}`

            axios.put(url, body).then((response) => {
                const result = response.data

                if(result['status'] == 'success') {
                    toast.success('Successfully edited')

                    sessionStorage['parent_mobile_no'] = parentMobileNo
                    sessionStorage['division'] = division

                    navigate('/home')
                } else {
                    toast.error(result['error'])
                }
            })
        }
    }

    return (
        <div>
            <h1>Edit Details</h1>

            <div className="row">
                <div className="col"></div>
                <div className="col">
                    <div className="form">
                        <div className="mb-3">
                            <label htmlFor="" className="label-control">Division</label>
                            <input onChange={(e) => {
                                setDivision(e.target.value)
                            }} type="text" className="form-control" />
                        </div>

                        <div className="mb-3">
                            <label htmlFor="" className="label-control">Parent number</label>
                            <input onChange={(e) => {
                                setParentMobileNo(e.target.value)
                            }} type="text" className="form-control" />
                        </div>

                        <div className="mb-3">
                            <button onClick={edit} className="btn btn-success">Save</button>
                        </div>

                        <div className="mb-3">
                            <button onClick={goBack} className="btn btn-success">Cancel</button>
                        </div>
                    </div>
                </div>
                <div className="col"></div>
            </div>
        </div>
    )

}

export default EditStudent