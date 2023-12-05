import { useState } from "react"
import { useNavigate } from "react-router"
import { Link } from "react-router-dom"
import { toast } from "react-toastify"
import axios from 'axios'





const Signin = () => {
 const [rollNo, setRollNo] = useState(0)

 const navigate = useNavigate()

 const signinuser = () => {
     if(rollNo == 0) {
         toast.warning('Please enter valid roll number')
     } else {
         const body = {
             rollNo,
         }

         const url = `http://localhost:4000/student/searchbyrollno/14`

         axios.post(url, body).then((response) => {
             const result = response.data

             if(result['status'] == 'success') {
                 toast.success('Welcome student')

                 const { roll_no, name, division, dateofbirth, parent_mobile_no } = result['data']

                 sessionStorage['rollNo'] = roll_no
                 sessionStorage['name'] = name
                 sessionStorage['division'] = division
                 sessionStorage['dateofbirth'] = dateofbirth
                 sessionStorage['parent_mobile_no'] = parent_mobile_no

                 navigate('/home')
             } else {
                 toast.error('Invalid roll number')
             }
         })

     }
 }

 return (
     <div>
         <h1>Enter Roll Number</h1>

         <div className="row">
             <div className="col"></div>
             <div className="col">
                 <div className="form">
                     <div className="mb-3">
                         <label htmlFor="" className="label-control">
                             Roll number
                         </label>
                         <input onChange={(e) => {
                             setRollNo(e.target.value)
                         }} type="text" className="form-control" />
                     </div>

                     <div className="mb-3">
                         <div>
                             Not available ? <Link to="/signup">Add Student</Link>
                         </div>
                         <button onClick={signinuser} className="btn btn-primary">Get Student</button>
                     </div>
                 </div>
             </div>
             <div className="col"></div>
         </div>

     </div>
 )

}

export default Signin