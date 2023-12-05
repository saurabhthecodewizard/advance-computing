
import { useNavigate } from "react-router"
import { toast } from "react-toastify"


const Refresh = () => {

    const navigate = useNavigate()

    const refreshPage = () => {
        navigate('/getall')
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
            <div className="row">
                <div className="col"></div>
                <div className="col">
                    <button onClick={refreshPage} className="btn btn-success">Back to list</button>
                    <button onClick={logoutUser} className="btn btn-danger">Logout</button>
                </div>
                <div className="col"></div>
            </div>
        </div>
    )
}

export default Refresh