class Solution {
    func isPalindrome(_ s: String) -> Bool {
        let sCleaned = s.filter{val in val.isNumber || val.isLetter}.lowercased()
        if (sCleaned.isEmpty) {
            return true
        }
        var forward = sCleaned.startIndex
        var backward = sCleaned.index(before: sCleaned.endIndex)
        while forward < backward {
            if (sCleaned[forward] != sCleaned[backward]) {
                return false
            } else {
                forward = sCleaned.index(after: forward)
                backward = sCleaned.index(before: backward)
            }
        }
        return true
    }
}

var solution = Solution()
print("1")
assert(solution.isPalindrome("A man, a plan, a canal: Panama"), "test failed")
print("2")
assert(solution.isPalindrome(".,"), "test failed")
print("3")
assert(!solution.isPalindrome("race a car"), "test failed")
print("4")
assert(solution.isPalindrome(" "), "test failed")
