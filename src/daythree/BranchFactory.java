package daythree;

import daythree.models.Branch;
import daythree.models.ExternalBranch;
import daythree.models.InternalBranch;

public class BranchFactory {

    public Branch getBranch(String branchType) {
        if (branchType.equals("InternalBranch")) {
            return new InternalBranch();
        } else if (branchType.equals("ExternalBranch")) {
            return new ExternalBranch();
        }
        return null;
    }
}
