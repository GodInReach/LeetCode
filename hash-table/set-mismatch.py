class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        l = len(nums)
        summ = sum(nums)
        rsum = l*(l+1)//2
        usum = sum(set(nums))
        return [summ-usum,rsum-usum]
