import { useNavigate } from "react-router"
import { toast } from "react-toastify"





const Home = () => {

    const { rollNo, name, division, dateofbirth, parent_mobile_no } = sessionStorage

    const navigate = useNavigate()

    const editStudent = () => {
        navigate('/edit')
    }

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
            <h1>Student logged in</h1>
            <div className="row">
                <div className="col"></div>
                <div className="col">
                    <div className="mb-3">
                        <label htmlFor="" className="label-control">
                            Roll number
                        </label>
                        <h3>{rollNo}</h3>
                    </div>

                    <div className="mb-3">
                        <label htmlFor="" className="label-control">
                            Name
                        </label>
                        <h3>{name}</h3>
                    </div>

                    <div className="mb-3">
                        <label htmlFor="" className="label-control">
                            Division
                        </label>
                        <h3>{division}</h3>
                    </div>

                    <div className="mb-3">
                        <label htmlFor="" className="label-control">
                            DOB
                        </label>
                        <h3>{dateofbirth}</h3>
                    </div>

                    <div className="mb-3">
                        <label htmlFor="" className="label-control">
                            Parent Number
                        </label>
                        <h3>{parent_mobile_no}</h3>
                    </div>
                    <br />
                    <br />
                    <hr />
                    <br />
                    
                    <div className="mb-3">
                        <button onClick={editStudent} className="btn btn-primary">Edit division</button>
                    </div>

                    <div className="mb-3">
                        {rollNo == 1 && (
                            <button onClick={() => {
                                navigate('/getall')
                            }} className="btn btn-info">Get all students</button>
                        )}
                    </div>

                    <div className="mb-3" margin="10px">
                        <button onClick={logoutUser} className="btn btn-success">Logout</button>
                    </div>
                </div>
                <div className="col"></div>
            </div>
        </div>
    )

}


export default Home